class Robot(private var x: Int, private var y: Int, private var direction: Direction) {
    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.LEFT -> Direction.DOWN
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
        }
    }
    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.RIGHT -> Direction.DOWN
            Direction.DOWN -> Direction.LEFT
            Direction.LEFT -> Direction.UP
        }
    }
    fun stepForward() {
        when (direction){
            Direction.UP -> y += 1
            Direction.DOWN -> y -= 1
            Direction.LEFT -> x -= 1
            Direction.RIGHT -> x += 1
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}

enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

fun main() {
    var robot = Robot(3, 2, Direction.UP)
    print(robot.toString())
}