import javax.swing.*
import java.awt.*

transforms << { result ->

	if (result instanceof String) {
		if (result ==~ /<html>.*<\/html>/) {
			def label = new JLabel(result)
			label.font = new Font('Serif', Font.PLAIN, 72)
			label
		} else if (result == 'Gr8ConfUS') {
			new ImageIcon('/Users/mrhaki/Projects/gr8conf2015us/groovy-goodness/images/gr8confus.png')
		} else {
			"Groovy says: $result"
		}
	}

}