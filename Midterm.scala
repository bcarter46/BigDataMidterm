var lines=sc.textFile("/users/benba/desktop/Encrypted-1.txt")
var words = lines.flatMap(line => line.split(" "))
var wordsCleaned=words.map(x=> x.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())
var chars= wordsCleaned.flatMap(line => line.split(""))
var charsNonEmpty=chars.filter(_.nonEmpty)
var charAnalysis=charsNonEmpty.map(x => (x,1)).reduceByKey(_+_)
var charFlopped=charAnalysis.map(x => x.swap)
var charSorted=charFlopped.sortByKey(false)
var charFlipped=charSorted.map(x => x.swap)
var mostFreq=charFlipped.collect()
var mostFreqChar=mostFreq.head
var mostFreqChar1= mostFreqChar._1.charAt(0)
var goal='e'
var diff=(goal-mostFreqChar1).toByte

for (a <- 0 to 26){
var shiftedText=charsNonEmpty.map(x=>(((x.charAt(0).toByte)+a)%26+97).toChar)
var array=shiftedText.collect().take(100)
println("-----------------------")
println(a)
println(array.mkString)
}

var shiftedText=charsNonEmpty.map(x=>(((x.charAt(0).toByte)+20)%26+97).toChar)
println(shiftedText.collect().mkString)






var lines=sc.textFile("/users/benba/desktop/Encrypted-2.txt")
var words = lines.flatMap(line => line.split(" "))
var wordsCleaned=words.map(x=> x.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())
var chars= wordsCleaned.flatMap(line => line.split(""))
var charsNonEmpty=chars.filter(_.nonEmpty)
var charAnalysis=charsNonEmpty.map(x => (x,1)).reduceByKey(_+_)
var charFlopped=charAnalysis.map(x => x.swap)
var charSorted=charFlopped.sortByKey(false)
var charFlipped=charSorted.map(x => x.swap)
var mostFreq=charFlipped.collect()
var mostFreqChar=mostFreq.head
var mostFreqChar1= mostFreqChar._1.charAt(0)
var goal='e'
var diff=(mostFreqChar1-goal).toByte

for (a <- 0 to 26){
var shiftedText=charsNonEmpty.map(x=> (((x.charAt(0).toByte)+a)%26+97).toChar)
var array=shiftedText.collect().take(100)
println("-----------------------")
println(a)
println(array.mkString)
}

var shiftedText=charsNonEmpty.map(x=> (((x.charAt(0).toByte)+14)%26+97).toChar)
println(shiftedText.collect().mkString)






var lines=sc.textFile("/users/benba/desktop/Encrypted-3.txt")
var words = lines.flatMap(line => line.split(" "))
var wordsCleaned=words.map(x=> x.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())
var chars= wordsCleaned.flatMap(line => line.split(""))
var charsNonEmpty=chars.filter(_.nonEmpty)
var charAnalysis=charsNonEmpty.map(x => (x,1)).reduceByKey(_+_)
var charFlopped=charAnalysis.map(x => x.swap)
var charSorted=charFlopped.sortByKey(false)
var charFlipped=charSorted.map(x => x.swap)
var mostFreq=charFlipped.collect()
var mostFreqChar=mostFreq.head
var mostFreqChar1= mostFreqChar._1.charAt(0)
var goal='e'
var diff=(mostFreqChar1-goal).toByte

for (a <- 0 to 26){
var shiftedText=charsNonEmpty.map(x=>(((x.charAt(0).toByte)+a)%26+96).toChar)
var array=shiftedText.collect().take(100)
println("-----------------------")
println(a)
println(array.mkString)
}

var shiftedText=charsNonEmpty.map(x=>(((x.charAt(0).toByte)+3)%26+96).toChar)
println(shiftedText.collect().mkString)
