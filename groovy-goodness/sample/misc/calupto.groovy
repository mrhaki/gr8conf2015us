def c1 = Calendar.instance
c1.set(year: 2015, date: 30)

def c2 = c1.copyWith(month: Calendar.AUGUST)

c1.upto(c2) {
    println it.format('EEEE dd-MM-yyyy')
}
