def a = ['Hearts', 'Diamonds', 'Clubs', 'Spades']
def b = (2..10) + ['Jack', 'Queen', 'King', 'Ace']

def deck = a.subsequences()

println deck
println deck.findAll { it.size() == 2}.toSorted { it.first() }