package com.example.compose_pet_journal.ui.onboarding

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnBoardingScreen() {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "반려견의 성장을 기록해요",
                    style = MaterialTheme.
                )

//                Button(
//                    onClick = {
//
//                    },
//                    modifier = Modifier
//                        .animateContentSize()
//                        .align(Alignment.)
//                        .padding(bottom = 32.dp)
//                        .height(56.dp)
//                        .clip(CircleShape)
//                ) {
//                    Text(
//                        text = "카카오로 시작하기",
//                        modifier = Modifier.padding(vertical =16.dp),
//                        color = MaterialTheme.colorScheme.onPrimary
//                    )
//                }
            }

        }


    }

}