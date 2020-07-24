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


@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class TwoPassStabilizer extends StabilizerBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TwoPassStabilizer(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TwoPassStabilizer(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TwoPassStabilizer position(long position) {
        return (TwoPassStabilizer)super.position(position);
    }
    @Override public TwoPassStabilizer getPointer(long i) {
        return new TwoPassStabilizer(this).position(position + i);
    }
    public IFrameSource asIFrameSource() { return asIFrameSource(this); }
    @Namespace public static native @Name("static_cast<cv::videostab::IFrameSource*>") IFrameSource asIFrameSource(TwoPassStabilizer pointer);

    public TwoPassStabilizer() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native void setMotionStabilizer(@Ptr IMotionStabilizer val);
    public native @Ptr IMotionStabilizer motionStabilizer();

    public native void setWobbleSuppressor(@Ptr WobbleSuppressorBase val);
    public native @Ptr WobbleSuppressorBase wobbleSuppressor();

    public native void setEstimateTrimRatio(@Cast("bool") boolean val);
    public native @Cast("bool") boolean mustEstimateTrimaRatio();

    public native void reset();
    public native @ByVal Mat nextFrame();
}
