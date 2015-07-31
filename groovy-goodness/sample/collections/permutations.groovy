def a = ['Hearts', 'Diamonds', 'Clubs', 'Spades']
def b = (2..10) + ['Jack', 'Queen', 'King', 'Ace']

def deck = a.permutations()

println deck
println deck.size()
