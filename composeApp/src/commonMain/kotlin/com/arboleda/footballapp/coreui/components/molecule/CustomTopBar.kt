package com.arboleda.footballapp.coreui.components.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arboleda.footballapp.core.Constants.EMPTY_STRING
import com.arboleda.footballapp.coreui.color.BackgroundSecondaryColor
import com.arboleda.footballapp.coreui.color.DefaultTextColor
import footballapp.composeapp.generated.resources.Res
import footballapp.composeapp.generated.resources.SourceSans3_italic
import footballapp.composeapp.generated.resources.SourceSans3_regular
import org.jetbrains.compose.resources.Font

@Composable
fun CustomTopBar(
    modifier: Modifier = Modifier,
    listItems: List<String> = emptyList(),
    containerColor: Color?,
    description: String?,
    onBack: () -> Unit = {},
) {
    Row(
        modifier =
            modifier
                .fillMaxWidth()
                .background(color = containerColor ?: BackgroundSecondaryColor)
                .padding(horizontal = 28.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (description != "Live Score") {
            Icon(
                modifier =
                    Modifier
                        .size(24.dp)
                        .clickable {
                            onBack()
                        },
                imageVector = Icons.Filled.ArrowBackIosNew,
                contentDescription = "Back",
                tint = DefaultTextColor,
            )

            Text(
                modifier =
                    Modifier
                        .weight(1f)
                        .padding(horizontal = 8.dp),
                text = description ?: EMPTY_STRING,
                fontWeight = FontWeight.SemiBold,
                fontFamily = createCustomFontFamily(),
                fontSize = 20.sp,
                color = DefaultTextColor,
                textAlign = TextAlign.Center,
            )
        } else {
            Text(
                modifier =
                    Modifier
                        .weight(1f)
                        .padding(horizontal = 8.dp),
                text = description ?: EMPTY_STRING,
                fontWeight = FontWeight.SemiBold,
                fontFamily = createCustomFontFamily(),
                fontSize = 20.sp,
                color = DefaultTextColor,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
fun createCustomFontFamily(): FontFamily =
    FontFamily(
        Font(
            resource = Res.font.SourceSans3_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.SourceSans3_regular,
            weight = FontWeight.Bold,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.SourceSans3_italic,
            weight = FontWeight.Normal,
            style = FontStyle.Italic,
        ),
    )
