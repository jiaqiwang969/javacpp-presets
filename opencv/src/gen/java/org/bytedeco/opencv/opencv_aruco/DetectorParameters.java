// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_aruco;

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

import static org.bytedeco.opencv.global.opencv_aruco.*;


/**
 * \brief Parameters for the detectMarker process:
 * - adaptiveThreshWinSizeMin: minimum window size for adaptive thresholding before finding
 *   contours (default 3).
 * - adaptiveThreshWinSizeMax: maximum window size for adaptive thresholding before finding
 *   contours (default 23).
 * - adaptiveThreshWinSizeStep: increments from adaptiveThreshWinSizeMin to adaptiveThreshWinSizeMax
 *   during the thresholding (default 10).
 * - adaptiveThreshConstant: constant for adaptive thresholding before finding contours (default 7)
 * - minMarkerPerimeterRate: determine minimum perimeter for marker contour to be detected. This
 *   is defined as a rate respect to the maximum dimension of the input image (default 0.03).
 * - maxMarkerPerimeterRate:  determine maximum perimeter for marker contour to be detected. This
 *   is defined as a rate respect to the maximum dimension of the input image (default 4.0).
 * - polygonalApproxAccuracyRate: minimum accuracy during the polygonal approximation process to
 *   determine which contours are squares. (default 0.03)
 * - minCornerDistanceRate: minimum distance between corners for detected markers relative to its
 *   perimeter (default 0.05)
 * - minDistanceToBorder: minimum distance of any corner to the image border for detected markers
 *   (in pixels) (default 3)
 * - minMarkerDistanceRate: minimum mean distance beetween two marker corners to be considered
 *   similar, so that the smaller one is removed. The rate is relative to the smaller perimeter
 *   of the two markers (default 0.05).
 * - cornerRefinementMethod: corner refinement method. (CORNER_REFINE_NONE, no refinement.
 *   CORNER_REFINE_SUBPIX, do subpixel refinement. CORNER_REFINE_CONTOUR use contour-Points,
 *   CORNER_REFINE_APRILTAG  use the AprilTag2 approach). (default CORNER_REFINE_NONE)
 * - cornerRefinementWinSize: window size for the corner refinement process (in pixels) (default 5).
 * - cornerRefinementMaxIterations: maximum number of iterations for stop criteria of the corner
 *   refinement process (default 30).
 * - cornerRefinementMinAccuracy: minimum error for the stop cristeria of the corner refinement
 *   process (default: 0.1)
 * - markerBorderBits: number of bits of the marker border, i.e. marker border width (default 1).
 * - perspectiveRemovePixelPerCell: number of bits (per dimension) for each cell of the marker
 *   when removing the perspective (default 4).
 * - perspectiveRemoveIgnoredMarginPerCell: width of the margin of pixels on each cell not
 *   considered for the determination of the cell bit. Represents the rate respect to the total
 *   size of the cell, i.e. perspectiveRemovePixelPerCell (default 0.13)
 * - maxErroneousBitsInBorderRate: maximum number of accepted erroneous bits in the border (i.e.
 *   number of allowed white bits in the border). Represented as a rate respect to the total
 *   number of bits per marker (default 0.35).
 * - minOtsuStdDev: minimun standard deviation in pixels values during the decodification step to
 *   apply Otsu thresholding (otherwise, all the bits are set to 0 or 1 depending on mean higher
 *   than 128 or not) (default 5.0)
 * - errorCorrectionRate error correction rate respect to the maximun error correction capability
 *   for each dictionary. (default 0.6).
 * - aprilTagMinClusterPixels: reject quads containing too few pixels. (default 5)
 * - aprilTagMaxNmaxima: how many corner candidates to consider when segmenting a group of pixels into a quad. (default 10)
 * - aprilTagCriticalRad: Reject quads where pairs of edges have angles that are close to straight or close to
 *   180 degrees. Zero means that no quads are rejected. (In radians) (default 10*PI/180)
 * - aprilTagMaxLineFitMse:  When fitting lines to the contours, what is the maximum mean squared error
 *   allowed?  This is useful in rejecting contours that are far from being quad shaped; rejecting
 *   these quads "early" saves expensive decoding processing. (default 10.0)
 * - aprilTagMinWhiteBlackDiff: When we build our model of black & white pixels, we add an extra check that
 *   the white model must be (overall) brighter than the black model.  How much brighter? (in pixel values, [0,255]). (default 5)
 * - aprilTagDeglitch:  should the thresholded image be deglitched? Only useful for very noisy images. (default 0)
 * - aprilTagQuadDecimate: Detection of quads can be done on a lower-resolution image, improving speed at a
 *   cost of pose accuracy and a slight decrease in detection rate. Decoding the binary payload is still
 *   done at full resolution. (default 0.0)
 * - aprilTagQuadSigma: What Gaussian blur should be applied to the segmented image (used for quad detection?)
 *   Parameter is the standard deviation in pixels.  Very noisy images benefit from non-zero values (e.g. 0.8). (default 0.0)
 * - detectInvertedMarker: to check if there is a white marker. In order to generate a "white" marker just
 *   invert a normal marker by using a tilde, ~markerImage. (default false)
 */
@Namespace("cv::aruco") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_aruco.class)
public class DetectorParameters extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectorParameters(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectorParameters(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DetectorParameters position(long position) {
        return (DetectorParameters)super.position(position);
    }
    @Override public DetectorParameters getPointer(long i) {
        return new DetectorParameters(this).position(position + i);
    }


    public DetectorParameters() { super((Pointer)null); allocate(); }
    private native void allocate();

    public static native @Ptr DetectorParameters create();

    public native int adaptiveThreshWinSizeMin(); public native DetectorParameters adaptiveThreshWinSizeMin(int setter);
    public native int adaptiveThreshWinSizeMax(); public native DetectorParameters adaptiveThreshWinSizeMax(int setter);
    public native int adaptiveThreshWinSizeStep(); public native DetectorParameters adaptiveThreshWinSizeStep(int setter);
    public native double adaptiveThreshConstant(); public native DetectorParameters adaptiveThreshConstant(double setter);
    public native double minMarkerPerimeterRate(); public native DetectorParameters minMarkerPerimeterRate(double setter);
    public native double maxMarkerPerimeterRate(); public native DetectorParameters maxMarkerPerimeterRate(double setter);
    public native double polygonalApproxAccuracyRate(); public native DetectorParameters polygonalApproxAccuracyRate(double setter);
    public native double minCornerDistanceRate(); public native DetectorParameters minCornerDistanceRate(double setter);
    public native int minDistanceToBorder(); public native DetectorParameters minDistanceToBorder(int setter);
    public native double minMarkerDistanceRate(); public native DetectorParameters minMarkerDistanceRate(double setter);
    public native int cornerRefinementMethod(); public native DetectorParameters cornerRefinementMethod(int setter);
    public native int cornerRefinementWinSize(); public native DetectorParameters cornerRefinementWinSize(int setter);
    public native int cornerRefinementMaxIterations(); public native DetectorParameters cornerRefinementMaxIterations(int setter);
    public native double cornerRefinementMinAccuracy(); public native DetectorParameters cornerRefinementMinAccuracy(double setter);
    public native int markerBorderBits(); public native DetectorParameters markerBorderBits(int setter);
    public native int perspectiveRemovePixelPerCell(); public native DetectorParameters perspectiveRemovePixelPerCell(int setter);
    public native double perspectiveRemoveIgnoredMarginPerCell(); public native DetectorParameters perspectiveRemoveIgnoredMarginPerCell(double setter);
    public native double maxErroneousBitsInBorderRate(); public native DetectorParameters maxErroneousBitsInBorderRate(double setter);
    public native double minOtsuStdDev(); public native DetectorParameters minOtsuStdDev(double setter);
    public native double errorCorrectionRate(); public native DetectorParameters errorCorrectionRate(double setter);

    // April :: User-configurable parameters.
    public native float aprilTagQuadDecimate(); public native DetectorParameters aprilTagQuadDecimate(float setter);
    public native float aprilTagQuadSigma(); public native DetectorParameters aprilTagQuadSigma(float setter);

    // April :: Internal variables
    public native int aprilTagMinClusterPixels(); public native DetectorParameters aprilTagMinClusterPixels(int setter);
    public native int aprilTagMaxNmaxima(); public native DetectorParameters aprilTagMaxNmaxima(int setter);
    public native float aprilTagCriticalRad(); public native DetectorParameters aprilTagCriticalRad(float setter);
    public native float aprilTagMaxLineFitMse(); public native DetectorParameters aprilTagMaxLineFitMse(float setter);
    public native int aprilTagMinWhiteBlackDiff(); public native DetectorParameters aprilTagMinWhiteBlackDiff(int setter);
    public native int aprilTagDeglitch(); public native DetectorParameters aprilTagDeglitch(int setter);

    // to detect white (inverted) markers
    public native @Cast("bool") boolean detectInvertedMarker(); public native DetectorParameters detectInvertedMarker(boolean setter);
}
