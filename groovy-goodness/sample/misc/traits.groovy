trait Identity {
    String id
    
    void generateId() {
        id = UUID.randomUUID().toString()
    }
}

class User { 
    String name
}

def u = new User(name: 'mrhaki') as Identity
u.generateId()


u.with {
    println id
    println name
}


trait Version {
    Long version = 0L
}

def mrhaki = new User(name: 'mrhaki').withTraits Identity, Version
mrhaki.generateId()
mrhaki.version = 1L

mrhaki.with {
    println id
    println version
    println name
}