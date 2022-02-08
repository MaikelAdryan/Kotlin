//dsti = distancia inicial, dstf = distancia final
//tmpi = tempo inicial,tmpf = tempo final
//vlci = velocidade inicial, vlcf = velocidade final

class Calculos {
    fun forcaPeso(massa: Float, gravidade: Float): Float = massa * gravidade
    fun forcaCentripeta(massa: Float, raio: Float, velocidade: Float): Float = massa * ((velocidade * velocidade) / raio)
    fun impulso(forca: Double, massa: Double, vlci: Double, vlcf: Double): Double = ((vlcf - vlci) * massa) / forca
    fun forcaElastica(constante: Float, deformacao: Float): Float = constante * deformacao
    fun velocidadeMedia(distancia: Double, tempo: Double): Double = distancia / tempo
    fun mru(dsti: Double, dstf: Double, tmpi: Double, tmpf: Double): Double = (dstf - dsti) / (tmpf - tmpi)
    fun mruv(vldi: Double, aceleracao: Double, instante: Double): Double = (vldi + aceleracao) * instante
}