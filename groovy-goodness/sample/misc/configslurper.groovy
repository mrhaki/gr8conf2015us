def configuration = '''

message = 'Gr8Conf is great!'

active = false

locations {
    room {
        name = 'Room'
    }
    
    auditorium {
        name = 'Auditorium'
    }
}


'''

def env = 'room'
def configSlurper = new ConfigSlurper(env)
configSlurper.registerConditionalBlock('locations', env)
def c = configSlurper.parse(configuration)

println c.message
println c.name


def isActive = c.isSet('active')
if (!isActive) {
    println 'not active'
}