package com.example.app3_compose.ui

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showSystemUi = true)
fun SearchBar() {
    /* 3가지 remember 변수 선언 방식 */
    val value1: MutableState<String> = remember { mutableStateOf("") }
    var value2 by remember { mutableStateOf("") }
    val (value3: String, setValue3: (String) -> Unit) = remember { mutableStateOf("크크") }

    /* 상태 변경 */
    value1.value = "하하"
    value2 = "Asd"
    setValue3.invoke("dd")

    OutlinedTextField(
        modifier = Modifier.wrapContentSize(),
        value = value3,
        onValueChange = { setValue3.invoke(it) },
    )
}