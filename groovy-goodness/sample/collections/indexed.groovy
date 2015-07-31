def list = ['Gr8Conf2015US', 'Groovy', 'Grails', 'Gradle', 'Gr8Conf2015US'].asImmutable()

println list

println list.indexed()

def alphabet = 'a'..'z'

def c = alphabet.indexed(1)

def word = 'groovy'

word.inject([]) { position, letter ->
    position << c.find { k, v -> v == letter}.key
}
