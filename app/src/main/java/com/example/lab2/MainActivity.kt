package com.example.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Lab2Tasks()
        }
    }
}
@Composable
fun Lab2Tasks() {

    val result = buildString {

        appendLine("LABORATORY WORK 2")
        appendLine()
        appendLine("ARRAYS")
        appendLine()

        // 1. Создать массив из 5 целых чисел и вывести все элементы.
        val numbers = arrayOf(10, 20, 30, 40, 50)
        appendLine("1. Array: ${numbers.joinToString()}")

        // 2. Найти сумму элементов массива.
        val sum = numbers.sum()
        appendLine("2. Sum = $sum")

        // 3. Найти максимальный элемент массива.
        val max = numbers.maxOrNull()
        appendLine("3. Maximum = $max")

        // 4. Посчитать количество чётных чисел в массиве.
        val evenCount = numbers.count { it % 2 == 0 }
        appendLine("4. Even numbers = $evenCount")

        // 5. Развернуть массив.
        val reversed = numbers.reversedArray()
        appendLine("5. Reversed: ${reversed.joinToString()}")

        // 6. Проверить, содержит ли массив заданное число.``
        val searchNumber = 30
        val containsNumber = numbers.contains(searchNumber)
        appendLine("6. Contains $searchNumber: $containsNumber")

        // 7. Отсортировать массив по возрастанию.
        val sorted = numbers.sortedArray()
        appendLine("7. Sorted: ${sorted.joinToString()}")

        // 8. Создать массив строк и найти самую длинную строку.
        val words = arrayOf("Kotlin", "Java", "Android", "Programming")
        val longestWord = words.maxByOrNull { it.length }
        appendLine("8. Longest string = $longestWord")

        // 9. Найти индекс минимального элемента массива.
        val minIndex = numbers.indexOf(numbers.minOrNull())
        appendLine("9. Index of minimum = $minIndex")

        // 10. Умножить каждый элемент массива на 2.
        val doubled = numbers.map { it * 2 }
        appendLine("10. Elements × 2: ${doubled.joinToString()}")

        appendLine()
        appendLine("ARRAYLIST")
        appendLine()

        // 1. Создать список целых чисел и добавить 10 элементов.
        val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        appendLine("1. List: ${list.joinToString()}")

        // 2. Удалить элемент из списка по индексу.
        list.removeAt(2)
        appendLine("2. After removing index 2: ${list.joinToString()}")

        // 3. Найти среднее значение элементов списка.
        val average = list.average()
        appendLine("3. Average = $average")

        // 4. Проверить, пустой ли список.
        appendLine("4. Is list empty: ${list.isEmpty()}")

        // 5. Заменить элемент списка на другой.
        list[0] = 100
        appendLine("5. After replacing first element: ${list.joinToString()}")

        // 6. Перевести список строк в верхний регистр.
        val names = mutableListOf("kotlin", "java", "android")
        val upperNames = names.map { it.uppercase() }
        appendLine("6. Uppercase: ${upperNames.joinToString()}")

        // 7. Создать список чисел и удалить все чётные.
        val numbersList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
        numbersList.removeAll { it % 2 == 0 }
        appendLine("7. Without even numbers: ${numbersList.joinToString()}")

        // 8. Объединить два списка в один.
        val firstList = listOf(1, 2, 3)
        val secondList = listOf(4, 5, 6)
        val combinedList = firstList + secondList
        appendLine("8. Combined list: ${combinedList.joinToString()}")

        // 9. Найти второй по величине элемент списка.
        val values = listOf(10, 50, 30, 40, 20)
        val secondLargest = values.distinct().sortedDescending()[1]
        appendLine("9. Second largest = $secondLargest")

        // 10. Преобразовать список чисел в множество.
        val numberList = listOf(1, 2, 2, 3, 3, 4)
        val numberSet = numberList.toSet()
        appendLine("10. Set: ${numberSet.joinToString()}")

        appendLine()
        appendLine("SET")
        appendLine()

        // 1. Создать множество из чисел и вывести его.
        val set1 = mutableSetOf(1, 2, 3, 4, 5)
        appendLine("1. Set: ${set1.joinToString()}")

        // 2. Добавить повторяющиеся элементы и проверить результат.
        set1.add(3)
        set1.add(4)
        appendLine("2. After adding duplicates: ${set1.joinToString()}")

        // 3. Найти пересечение двух множеств.
        val setA = setOf(1, 2, 3, 4)
        val setB = setOf(3, 4, 5, 6)
        val intersection = setA.intersect(setB)
        appendLine("3. Intersection: ${intersection.joinToString()}")

        // 4. Найти объединение двух множеств.
        val union = setA.union(setB)
        appendLine("4. Union: ${union.joinToString()}")

        // 5. Найти разность двух множеств.
        val difference = setA.subtract(setB)
        appendLine("5. Difference: ${difference.joinToString()}")

        // 6. Проверить, содержится ли элемент в множестве.
        val checkElement = 3
        appendLine("6. Contains $checkElement: ${setA.contains(checkElement)}")

        // 7. Подсчитать количество уникальных символов в строке.
        val text = "programming"
        val uniqueCharacters = text.toSet()
        appendLine("7. Unique characters: ${uniqueCharacters.size}")

        // 8. Преобразовать список в множество для удаления дубликатов.
        val duplicateList = listOf(1, 2, 2, 3, 3, 3, 4)
        val uniqueSet = duplicateList.toSet()
        appendLine("8. Without duplicates: ${uniqueSet.joinToString()}")

        // 9. Найти симметрическую разность двух множеств.
        val symmetricDifference =
            (setA - setB) union (setB - setA)
        appendLine("9. Symmetric difference: ${symmetricDifference.joinToString()}")

        // 10. Создать множество строк и проверить слово Kotlin.
        val languages = setOf("Java", "Python", "Kotlin", "C++")
        appendLine("10. Contains Kotlin: ${languages.contains("Kotlin")}")

        appendLine()
        appendLine("MAP")
        appendLine()

        // 1. Создать Map с ключами Int и значениями String.
        val students = mutableMapOf(
            1 to "Ali",
            2 to "Sara",
            3 to "John"
        )
        appendLine("1. Map: $students")

        // 2. Добавить новый элемент в Map.
        students[4] = "Amina"
        appendLine("2. After adding: $students")

        // 3. Получить значение по ключу.
        val studentName = students[2]
        appendLine("3. Value for key 2: $studentName")

        // 4. Проверить, есть ли ключ в Map.
        appendLine("4. Contains key 3: ${students.containsKey(3)}")

        // 5. Проверить, есть ли значение в Map.
        appendLine("5. Contains value Sara: ${students.containsValue("Sara")}")

        // 6. Вывести все ключи и значения.
        appendLine("6. Keys: ${students.keys}")
        appendLine("   Values: ${students.values}")

        // 7. Удалить элемент по ключу.
        students.remove(4)
        appendLine("7. After removing key 4: $students")

        // 8. Посчитать количество элементов в Map.
        appendLine("8. Map size = ${students.size}")

        // 9. Пройтись циклом по словарю.
        appendLine("9. Key-value pairs:")
        for ((key, value) in students) {
            appendLine("$key -> $value")
        }

        // 10. Map для оценок студентов и средняя оценка.
        val grades = mapOf(
            "Ali" to 5,
            "Sara" to 4,
            "John" to 5,
            "Amina" to 4
        )

        val averageGrade = grades.values.average()
        appendLine("10. Average grade = $averageGrade")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(text = result)
    }
}