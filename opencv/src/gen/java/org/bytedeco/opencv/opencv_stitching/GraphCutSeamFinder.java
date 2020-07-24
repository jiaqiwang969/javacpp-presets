// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Minimum graph cut-based seam estimator. See details in \cite V03 .
 */
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class GraphCutSeamFinder extends GraphCutSeamFinderBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphCutSeamFinder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GraphCutSeamFinder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public GraphCutSeamFinder position(long position) {
        return (GraphCutSeamFinder)super.position(position);
    }
    @Override public GraphCutSeamFinder getPointer(long i) {
        return new GraphCutSeamFinder(this).position(position + i);
    }
    public SeamFinder asSeamFinder() { return asSeamFinder(this); }
    @Namespace public static native @Name("static_cast<cv::detail::SeamFinder*>") SeamFinder asSeamFinder(GraphCutSeamFinder pointer);

    public GraphCutSeamFinder(int cost_type/*=COST_COLOR_GRAD*/, float terminal_cost/*=10000.f*/,
                           float bad_region_penalty/*=1000.f*/) { super((Pointer)null); allocate(cost_type, terminal_cost, bad_region_penalty); }
    private native void allocate(int cost_type/*=COST_COLOR_GRAD*/, float terminal_cost/*=10000.f*/,
                           float bad_region_penalty/*=1000.f*/);
    public GraphCutSeamFinder() { super((Pointer)null); allocate(); }
    private native void allocate();
    public GraphCutSeamFinder(@Str BytePointer cost_type,float terminal_cost/*=10000.f*/,
            float bad_region_penalty/*=1000.f*/) { super((Pointer)null); allocate(cost_type, terminal_cost, bad_region_penalty); }
    private native void allocate(@Str BytePointer cost_type,float terminal_cost/*=10000.f*/,
            float bad_region_penalty/*=1000.f*/);
    public GraphCutSeamFinder(@Str BytePointer cost_type) { super((Pointer)null); allocate(cost_type); }
    private native void allocate(@Str BytePointer cost_type);
    public GraphCutSeamFinder(@Str String cost_type,float terminal_cost/*=10000.f*/,
            float bad_region_penalty/*=1000.f*/) { super((Pointer)null); allocate(cost_type, terminal_cost, bad_region_penalty); }
    private native void allocate(@Str String cost_type,float terminal_cost/*=10000.f*/,
            float bad_region_penalty/*=1000.f*/);
    public GraphCutSeamFinder(@Str String cost_type) { super((Pointer)null); allocate(cost_type); }
    private native void allocate(@Str String cost_type);

    public native void find(@Const @ByRef UMatVector src, @Const @ByRef PointVector corners,
                  @ByRef UMatVector masks);
}
