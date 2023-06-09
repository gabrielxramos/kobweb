package com.gabriel.ramos.sections

import androidx.compose.runtime.Composable
import com.gabriel.ramos.components.header
import com.gabriel.ramos.models.Section
import com.gabriel.ramos.util.Constants.SECTION_WIDTH
import com.gabriel.ramos.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection(){
    Box (
        modifier = Modifier
            .id(Section.Home.id)
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ){
        MainBackgound()
        header()
    }
}

@Composable
fun MainBackgound(){
    Image(
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover),
        src = Res.Image.background,
        desc = "Background Image"
    )
}