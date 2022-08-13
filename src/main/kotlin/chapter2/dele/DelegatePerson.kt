package chapter2.dele

class DelegatePerson {
    var name: String by DelegateWithMessageString()
    var address: String by DelegateWithMessageString()
}
