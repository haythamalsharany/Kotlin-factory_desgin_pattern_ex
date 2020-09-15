interface Virus{
    fun mutate()
    fun spread()
}
enum class VirusType{
    corona,
    influenza,
    HIV

}
class CoronaVirus:Virus{
    override fun mutate() {
        println("this is CoronaVirus class ")
    }
    override fun spread() {
        println("this is CoronaVirus class ")
    }

}
class InfluenzaVirus:Virus{
    override fun mutate() {
        println("this is InfluenzaVirus class ")
    }
    override fun spread() {
        println("this is InfluenzaVirus class ")
    }

}
class HIVVirus:Virus{
    override fun mutate() {
        println("this is HIVVirus class ")
    }
    override fun spread() {
        println("this is HIVVirus class ")
    }

}
class VirusFactory{


    fun makeVirus(virusType:VirusType):Virus{
       var  type:Virus?
        if(virusType==VirusType.corona)
            type= CoronaVirus()
        else if(virusType==VirusType.influenza)
            type=InfluenzaVirus()
        else type=HIVVirus()
        return type;


    }
}

fun main() {

    var virus=VirusFactory().makeVirus(VirusType.influenza)
    virus.mutate()
    virus.spread()
    var virus1=VirusFactory().makeVirus(VirusType.corona)
    virus.mutate()
    virus.spread()
    var virus2=VirusFactory().makeVirus(VirusType.HIV)
    virus.mutate()
    virus.spread()

}