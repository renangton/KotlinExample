package chapter2.dele

import kotlin.reflect.KProperty

class DelegateWithMessage<T> {
    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("${property.name}を取得します")
        return value!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        println("${property.name}を更新します")
        this.value = value
    }
}
