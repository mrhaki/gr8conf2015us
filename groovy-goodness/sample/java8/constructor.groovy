@groovy.transform.Canonical
class User { String name }

class Greeting {
    static sayHello(s) {
        "Hello $s"
    }
}

def users = ['mrhaki', 'hubert']

def greeting = Greeting.&sayHello

def userConstructor = User.metaClass.&invokeConstructor


def result = users.stream().map(greeting).collect()

