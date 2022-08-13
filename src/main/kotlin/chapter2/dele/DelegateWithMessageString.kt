package chapter2.dele

import kotlin.reflect.KProperty

class DelegateWithMessageString {
    private var value: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("${property.name}を取得します")
        return value!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("${property.name} を 更新 します")
        this.value = value
    }
}
