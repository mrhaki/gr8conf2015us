class User {
    String name
    
    def 'switch'() {
        name.reverse()
    }
}

def u = new User(name: 'mrhaki')

println u.switch()