@groovy.transform.ToString
class User { String name }

def u1 = new User(name: 'mrhaki')
def u2 = [name: 'hubert'] as User

def users = [u1, u2]

def nameStartsWith = { letter, user -> user.name[0] == letter }
def nameStartsWithM = nameStartsWith.curry('m')

def result = users.stream().filter(nameStartsWithM).collect()