// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videoio;

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

import static org.bytedeco.opencv.global.opencv_videoio.*;


/** \example samples/cpp/tutorial_code/videoio/video-write/video-write.cpp
Check \ref tutorial_video_write "the corresponding tutorial" for more details
*/

/** \example samples/cpp/videowriter_basic.cpp
An example using VideoCapture and VideoWriter class
*/

/** \brief Video writer class.
<p>
The class provides C++ API for writing video files or image sequences.
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videoio.class)
public class VideoWriter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoWriter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public VideoWriter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public VideoWriter position(long position) {
        return (VideoWriter)super.position(position);
    }
    @Override public VideoWriter getPointer(long i) {
        return new VideoWriter(this).position(position + i);
    }

    /** \brief Default constructors
    <p>
    The constructors/functions initialize video writers.
    -   On Linux FFMPEG is used to write videos;
    -   On Windows FFMPEG or MSWF or DSHOW is used;
    -   On MacOSX AVFoundation is used.
     */
    public VideoWriter() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    @param filename Name of the output video file.
    @param fourcc 4-character code of codec used to compress the frames. For example,
    VideoWriter::fourcc('P','I','M','1') is a MPEG-1 codec, VideoWriter::fourcc('M','J','P','G') is a
    motion-jpeg codec etc. List of codes can be obtained at [Video Codecs by
    FOURCC](http://www.fourcc.org/codecs.php) page. FFMPEG backend with MP4 container natively uses
    other values as fourcc code: see [ObjectType](http://mp4ra.org/#/codecs),
    so you may receive a warning message from OpenCV about fourcc code conversion.
    @param fps Framerate of the created video stream.
    @param frameSize Size of the video frames.
    @param isColor If it is not zero, the encoder will expect and encode color frames, otherwise it
    will work with grayscale frames.
    <p>
    \b Tips:
    - With some backends {@code fourcc=-1} pops up the codec selection dialog from the system.
    - To save image sequence use a proper filename (eg. {@code img_%02d.jpg}) and {@code fourcc=0}
      OR {@code fps=0}. Use uncompressed image format (eg. {@code img_%02d.BMP}) to save raw frames.
    - Most codecs are lossy. If you want lossless video file you need to use a lossless codecs
      (eg. FFMPEG FFV1, Huffman HFYU, Lagarith LAGS, etc...)
    - If FFMPEG is enabled, using {@code codec=0; fps=0;} you can create an uncompressed (raw) video file.
    */
    public VideoWriter(@Str BytePointer filename, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/) { super((Pointer)null); allocate(filename, fourcc, fps, frameSize, isColor); }
    private native void allocate(@Str BytePointer filename, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public VideoWriter(@Str BytePointer filename, int fourcc, double fps,
                    @ByVal Size frameSize) { super((Pointer)null); allocate(filename, fourcc, fps, frameSize); }
    private native void allocate(@Str BytePointer filename, int fourcc, double fps,
                    @ByVal Size frameSize);
    public VideoWriter(@Str String filename, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/) { super((Pointer)null); allocate(filename, fourcc, fps, frameSize, isColor); }
    private native void allocate(@Str String filename, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public VideoWriter(@Str String filename, int fourcc, double fps,
                    @ByVal Size frameSize) { super((Pointer)null); allocate(filename, fourcc, fps, frameSize); }
    private native void allocate(@Str String filename, int fourcc, double fps,
                    @ByVal Size frameSize);

    /** \overload
    The {@code apiPreference} parameter allows to specify API backends to use. Can be used to enforce a specific reader implementation
    if multiple are available: e.g. cv::CAP_FFMPEG or cv::CAP_GSTREAMER.
     */
    public VideoWriter(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/) { super((Pointer)null); allocate(filename, apiPreference, fourcc, fps, frameSize, isColor); }
    private native void allocate(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public VideoWriter(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize) { super((Pointer)null); allocate(filename, apiPreference, fourcc, fps, frameSize); }
    private native void allocate(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize);
    public VideoWriter(@Str String filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/) { super((Pointer)null); allocate(filename, apiPreference, fourcc, fps, frameSize, isColor); }
    private native void allocate(@Str String filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public VideoWriter(@Str String filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize) { super((Pointer)null); allocate(filename, apiPreference, fourcc, fps, frameSize); }
    private native void allocate(@Str String filename, int apiPreference, int fourcc, double fps,
                    @ByVal Size frameSize);

    /** \overload
     * The {@code params} parameter allows to specify extra encoder parameters encoded as pairs (paramId_1, paramValue_1, paramId_2, paramValue_2, ... .)
     * see cv::VideoWriterProperties
     */
    public VideoWriter(@Str BytePointer filename, int fourcc, double fps, @Const @ByRef Size frameSize,
                            @Const @ByRef IntVector params) { super((Pointer)null); allocate(filename, fourcc, fps, frameSize, params); }
    private native void allocate(@Str BytePointer filename, int fourcc, double fps, @Const @ByRef Size frameSize,
                            @Const @ByRef IntVector params);
    public VideoWriter(@Str String filename, int fourcc, double fps, @Const @ByRef Size frameSize,
                            @Const @ByRef IntVector params) { super((Pointer)null); allocate(filename, fourcc, fps, frameSize, params); }
    private native void allocate(@Str String filename, int fourcc, double fps, @Const @ByRef Size frameSize,
                            @Const @ByRef IntVector params);

    /** \overload
     */
    public VideoWriter(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                            @Const @ByRef Size frameSize, @Const @ByRef IntVector params) { super((Pointer)null); allocate(filename, apiPreference, fourcc, fps, frameSize, params); }
    private native void allocate(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                            @Const @ByRef Size frameSize, @Const @ByRef IntVector params);
    public VideoWriter(@Str String filename, int apiPreference, int fourcc, double fps,
                            @Const @ByRef Size frameSize, @Const @ByRef IntVector params) { super((Pointer)null); allocate(filename, apiPreference, fourcc, fps, frameSize, params); }
    private native void allocate(@Str String filename, int apiPreference, int fourcc, double fps,
                            @Const @ByRef Size frameSize, @Const @ByRef IntVector params);

    /** \brief Default destructor
    <p>
    The method first calls VideoWriter::release to close the already opened file.
    */

    /** \brief Initializes or reinitializes video writer.
    <p>
    The method opens video writer. Parameters are the same as in the constructor
    VideoWriter::VideoWriter.
    @return {@code true} if video writer has been successfully initialized
    <p>
    The method first calls VideoWriter::release to close the already opened file.
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int fourcc, double fps,
                          @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public native @Cast("bool") boolean open(@Str BytePointer filename, int fourcc, double fps,
                          @ByVal Size frameSize);
    public native @Cast("bool") boolean open(@Str String filename, int fourcc, double fps,
                          @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public native @Cast("bool") boolean open(@Str String filename, int fourcc, double fps,
                          @ByVal Size frameSize);

    /** \overload
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                          @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public native @Cast("bool") boolean open(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                          @ByVal Size frameSize);
    public native @Cast("bool") boolean open(@Str String filename, int apiPreference, int fourcc, double fps,
                          @ByVal Size frameSize, @Cast("bool") boolean isColor/*=true*/);
    public native @Cast("bool") boolean open(@Str String filename, int apiPreference, int fourcc, double fps,
                          @ByVal Size frameSize);

    /** \overload
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int fourcc, double fps, @Const @ByRef Size frameSize,
                          @Const @ByRef IntVector params);
    public native @Cast("bool") boolean open(@Str String filename, int fourcc, double fps, @Const @ByRef Size frameSize,
                          @Const @ByRef IntVector params);

    /** \overload
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int apiPreference, int fourcc, double fps,
                          @Const @ByRef Size frameSize, @Const @ByRef IntVector params);
    public native @Cast("bool") boolean open(@Str String filename, int apiPreference, int fourcc, double fps,
                          @Const @ByRef Size frameSize, @Const @ByRef IntVector params);

    /** \brief Returns true if video writer has been successfully initialized.
    */
    public native @Cast("bool") boolean isOpened();

    /** \brief Closes the video writer.
    <p>
    The method is automatically called by subsequent VideoWriter::open and by the VideoWriter
    destructor.
     */
    public native void release();

    /** \brief Stream operator to write the next video frame.
    @see write
    */
    public native @ByRef @Name("operator <<") VideoWriter shiftLeft(@Const @ByRef Mat image);

    /** \overload
    @see write
    */
    public native @ByRef @Name("operator <<") VideoWriter shiftLeft(@Const @ByRef UMat image);

    /** \brief Writes the next video frame
    <p>
    @param image The written frame. In general, color images are expected in BGR format.
    <p>
    The function/method writes the specified image to video file. It must have the same size as has
    been specified when opening the video writer.
     */
    public native void write(@ByVal Mat image);
    public native void write(@ByVal UMat image);
    public native void write(@ByVal GpuMat image);

    /** \brief Sets a property in the VideoWriter.
     <p>
     @param propId Property identifier from cv::VideoWriterProperties (eg. cv::VIDEOWRITER_PROP_QUALITY)
     or one of \ref videoio_flags_others
     <p>
     @param value Value of the property.
     @return  {@code true} if the property is supported by the backend used by the VideoWriter instance.
     */
    public native @Cast("bool") boolean set(int propId, double value);

    /** \brief Returns the specified VideoWriter property
     <p>
     @param propId Property identifier from cv::VideoWriterProperties (eg. cv::VIDEOWRITER_PROP_QUALITY)
     or one of \ref videoio_flags_others
     <p>
     @return Value for the specified property. Value 0 is returned when querying a property that is
     not supported by the backend used by the VideoWriter instance.
     */
    public native double get(int propId);

    /** \brief Concatenates 4 chars to a fourcc code
    <p>
    @return a fourcc code
    <p>
    This static method constructs the fourcc code of the codec to be used in the constructor
    VideoWriter::VideoWriter or VideoWriter::open.
     */
    public static native int fourcc(@Cast("char") byte c1, @Cast("char") byte c2, @Cast("char") byte c3, @Cast("char") byte c4);

    /** \brief Returns used backend API name
     <p>
     \note Stream should be opened.
     */
    public native @Str BytePointer getBackendName();
}
