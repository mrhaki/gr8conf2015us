def list = ['Gr8Conf2015US', 'Groovy', 'Grails', 'Gradle', 'Gr8Conf2015US'].asImmutable()

println list

println list.withIndex()

def alphabet = 'a'..'z'

def c = alphabet.withIndex(1)

def word = 'groovy'

word.inject([]) { position, letter ->
    position << c.find { it.first() == letter }.last()
}
