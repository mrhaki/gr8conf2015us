def a = ['Hearts', 'Diamonds', 'Clubs', 'Spades']
def b = (2..10) + ['Jack', 'Queen', 'King', 'Ace']

def deck = [b,a].combinations()

println deck.findAll { it.last() == 'Hearts' }