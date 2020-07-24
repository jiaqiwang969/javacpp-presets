// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;


/** \brief finds arbitrary template in the grayscale image using Generalized Hough Transform
<p>
Detects position only without translation and rotation \cite Ballard1981 .
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class GeneralizedHoughBallard extends GeneralizedHough {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GeneralizedHoughBallard(Pointer p) { super(p); }

    /** R-Table levels. */
    public native void setLevels(int levels);
    public native int getLevels();

    /** The accumulator threshold for the template centers at the detection stage. The smaller it is, the more false positions may be detected. */
    public native void setVotesThreshold(int votesThreshold);
    public native int getVotesThreshold();
}
