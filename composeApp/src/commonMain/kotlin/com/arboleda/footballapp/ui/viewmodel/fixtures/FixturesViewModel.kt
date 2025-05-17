package com.arboleda.footballapp.ui.viewmodel.fixtures

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arboleda.footballapp.core.Constants.EMPTY_STRING
import com.arboleda.footballapp.domain.usecases.fixtures.FixturesModule
import com.arboleda.footballapp.ui.states.fixtures.FixturesState
import com.arboleda.footballapp.ui.states.fixtures.FixturesStateUI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class FixturesViewModel(
    private val fixturesModule: FixturesModule,
) : ViewModel() {
    var fixturesStateUI = MutableStateFlow<FixturesStateUI>(FixturesStateUI.Loading)
        private set

    var response = MutableStateFlow(FixturesState())
        private set

    init {
        getAllLiveFixtures()
    }

    private fun getAllLiveFixtures() {
        viewModelScope.launch {
            fixturesModule
                .getAllLiveFixtures()
                .onStart {
                    fixturesStateUI.value = FixturesStateUI.Loading
                }.catch {
                    fixturesStateUI.value = FixturesStateUI.Error(it.message ?: EMPTY_STRING)
                }.collect { fixturesWrapper ->
                    fixturesStateUI.value = FixturesStateUI.Success(fixturesWrapper)
                    response.value = response.value.copy(response = fixturesWrapper.response)
                }
        }
    }
}
