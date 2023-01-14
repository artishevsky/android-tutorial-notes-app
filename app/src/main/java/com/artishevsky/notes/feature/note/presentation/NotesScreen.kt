package com.artishevsky.notes.features.note.domain

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.artishevsky.notes.core.ui.theme.NotesTheme

@Composable
fun NotesScreen() {
    NotesTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Text(
                text = "Your notes",
                modifier = Modifier.semantics {
                    contentDescription = "Your notes"
                }
            )
        }
    }
}
