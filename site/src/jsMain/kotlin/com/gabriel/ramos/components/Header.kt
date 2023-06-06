package com.gabriel.ramos.components

import androidx.compose.runtime.Composable
import com.gabriel.ramos.models.Section
import com.gabriel.ramos.models.Theme
import com.gabriel.ramos.util.Constants.FONT_FAMILY
import com.gabriel.ramos.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun header() {
    Row(
        modifier = Modifier
            .fillMaxWidth(80.percent)
            .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        leftSide()
        rightSide()
    }
}

@Composable
fun leftSide() {
    Row {
        Image(
            src = Res.Image.logo,
            desc = "Logo Image",
        )
    }
}

@Composable
fun rightSide() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(r = 50.px)
            .backgroundColor(Theme.LighterGray.rgb)
            .padding(all = 20.px),
        horizontalArrangement = Arrangement.End
    ) {
        Section.values().take(6).forEach { section ->
            Link(
                modifier = Modifier
                    .padding(right = 30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal),
                path = section.path,
                text = section.title
            )
        }
    }
}