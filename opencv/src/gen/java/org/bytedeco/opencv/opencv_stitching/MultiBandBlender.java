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


/** \brief Blender which uses multi-band blending algorithm (see \cite BA83).
 */
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class MultiBandBlender extends Blender {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiBandBlender(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MultiBandBlender(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MultiBandBlender position(long position) {
        return (MultiBandBlender)super.position(position);
    }
    @Override public MultiBandBlender getPointer(long i) {
        return new MultiBandBlender(this).position(position + i);
    }

    public MultiBandBlender(int try_gpu/*=false*/, int num_bands/*=5*/, int weight_type/*=CV_32F*/) { super((Pointer)null); allocate(try_gpu, num_bands, weight_type); }
    private native void allocate(int try_gpu/*=false*/, int num_bands/*=5*/, int weight_type/*=CV_32F*/);
    public MultiBandBlender() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native int numBands();
    public native void setNumBands(int val);

    public native void prepare(@ByVal Rect dst_roi);
    public native void feed(@ByVal Mat img, @ByVal Mat mask, @ByVal Point tl);
    public native void feed(@ByVal UMat img, @ByVal UMat mask, @ByVal Point tl);
    public native void feed(@ByVal GpuMat img, @ByVal GpuMat mask, @ByVal Point tl);
    public native void blend(@ByVal Mat dst, @ByVal Mat dst_mask);
    public native void blend(@ByVal UMat dst, @ByVal UMat dst_mask);
    public native void blend(@ByVal GpuMat dst, @ByVal GpuMat dst_mask);
}
