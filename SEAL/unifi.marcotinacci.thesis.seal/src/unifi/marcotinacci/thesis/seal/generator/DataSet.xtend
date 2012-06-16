package unifi.marcotinacci.thesis.seal.generator

import java.util.HashSet
import org.eclipse.emf.common.util.EList
import unifi.marcotinacci.thesis.seal.seal.Range

class DataSet extends HashSet<Data>{
	new(EList<Range> ranges){
		for(r : ranges){
			if(r.delta == null){
				this.add(new Data(r.variable, Integer::parseInt(r.from), Integer::parseInt(r.to)))
			}else{
				this.add(new Data(r.variable, Double::parseDouble(r.from), Double::parseDouble(r.to), Double::parseDouble(r.delta)))
			}
			
		}
	}
}