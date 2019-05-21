package services

import kafka.manager.model.ActorModel.BVView

object Util {
//  def minIn(bvmap: Map[Int, BVView]): Double = {
//    var minList = scala.collection.mutable.ListBuffer[Double]()
//    for ((k, v) <- bvmap) {
//      minList += v.bytesInPerMinCountHistory.map(v => v.head.count + 1).getOrElse(0)
//    }
//    minList.sorted.head
//  }
//
//  def maxIn(bvmap: Map[Int, BVView]): Double = {
//    var minList = scala.collection.mutable.ListBuffer[Double]()
//    for ((k, v) <- bvmap) {
//      minList += v.bytesInPerMinCountHistory.map(v => v.last.count + 1).getOrElse(0)
//    }
//    minList.sorted.last
//  }
//
//  def minOut(bvmap: Map[Int, BVView]): Double = {
//    var minList = scala.collection.mutable.ListBuffer[Double]()
//    for ((k, v) <- bvmap) {
//      minList += v.bytesOutPerMinCountHistory.map(v => v.head.count + 1).getOrElse(0)
//    }
//    minList.sorted.head
//  }
//
//  def maxOut(bvmap: Map[Int, BVView]): Double = {
//    var minList = scala.collection.mutable.ListBuffer[Double]()
//    for ((k, v) <- bvmap) {
//      minList += v.bytesOutPerMinCountHistory.map(v => v.last.count + 1).getOrElse(0)
//    }
//    minList.sorted.last
//  }

  def getBrokersArray(bvmap: Map[Int, BVView]): String = {
    val str = new StringBuilder
    str.append("[")
    for (k <- bvmap.keys) {
      if (k != bvmap.keys.last)
        str.append("'" + k.toString + "'" + ",")
      else
        str.append("'" + k.toString + "'")
    }
    str.append("]")
    str.toString
  }

//  def getNodesArray(nodesList: List[ZkNodeState]): String = {
//    val str = new StringBuilder("[\"")
//    for (i <- (0 to nodesList.size - 2)) {
//      str.append(nodesList(i).ipAndPort).append("\",\"")
//    }
//    str.append(nodesList(nodesList.size - 1).ipAndPort).append("\"]")
//    str.toString()
//  }

  def getIpAndPort(ipp: String): String = {
    return "'" + ipp + "'"
  }
}
