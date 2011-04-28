



package code.model

import net.liftweb.mapper._

class Supplier extends LongKeyedMapper[Supplier] with IdPK {

  def getSingleton = Supplier



}
object Supplier extends Supplier with LongKeyedMetaMapper[Supplier]