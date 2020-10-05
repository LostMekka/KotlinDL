package api.core.initializer

import org.tensorflow.Operand
import org.tensorflow.op.Ops

/**
 * Initializer that generates tensors with constant values.
 *
 * NOTE: It does not work properly during model import/export, known issue: https://github.com/zaleslaw/Kotof/issues/4.
 *
 * @property constantValue Constant value to fill the tensor.
 * @constructor Creates a [Constant] initializer with a given [constantValue].
 */
public class Constant(private val constantValue: Float) : Initializer() {
    override fun initialize(
        fanIn: Int,
        fanOut: Int,
        tf: Ops,
        shape: Operand<Int>,
        name: String
    ): Operand<Float> {
        return tf.withName(name).fill(shape, tf.constant(constantValue))
    }

    override fun toString(): String {
        return "Constant(constantValue=$constantValue)"
    }
}