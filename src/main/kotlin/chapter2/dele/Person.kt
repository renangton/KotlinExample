package chapter2.dele

class Person {
    var name: String = ""
        get() {
            println("nameを取得します")
            return field
        }
        set(value) {
            println("nameを更新します")
            field = value
        }

    var address: String = ""
        get() {
            println("addressを取得します")
            return field
        }
        set(value) {
            println("addressを更新します")
            field = value
        }
}
