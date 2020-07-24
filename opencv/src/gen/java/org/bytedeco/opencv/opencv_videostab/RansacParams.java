// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


/** \brief Describes RANSAC method parameters.
 */
@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class RansacParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RansacParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RansacParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RansacParams position(long position) {
        return (RansacParams)super.position(position);
    }
    @Override public RansacParams getPointer(long i) {
        return new RansacParams(this).position(position + i);
    }

    /** subset size */
    public native int size(); public native RansacParams size(int setter);
    /** max error to classify as inlier */
    public native float thresh(); public native RansacParams thresh(float setter);
    /** max outliers ratio */
    public native float eps(); public native RansacParams eps(float setter);
    /** probability of success */
    public native float prob(); public native RansacParams prob(float setter);

    public RansacParams() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \brief Constructor
    @param size Subset size.
    @param thresh Maximum re-projection error value to classify as inlier.
    @param eps Maximum ratio of incorrect correspondences.
    @param prob Required success probability.
     */
    public RansacParams(int size, float thresh, float eps, float prob) { super((Pointer)null); allocate(size, thresh, eps, prob); }
    private native void allocate(int size, float thresh, float eps, float prob);

    /**
    @return Number of iterations that'll be performed by RANSAC method.
    */
    public native int niters();

    /**
    @param model Motion model. See cv::videostab::MotionModel.
    @return Default RANSAC method parameters for the given motion model.
    */
    public static native @ByVal RansacParams default2dMotion(@Cast("cv::videostab::MotionModel") int model);
}
