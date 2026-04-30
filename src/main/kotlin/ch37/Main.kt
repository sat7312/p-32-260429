package com.back.ch37

class Person {
    private var _name: String = "Unknown" // 내부 변수

    var name: String
        get() = throw IllegalAccessException("읽을 수 없습니다.") // Getter 호출 시 예외 발생
        set(value) { _name = value } // Setter 제공 (쓰기 가능)
}