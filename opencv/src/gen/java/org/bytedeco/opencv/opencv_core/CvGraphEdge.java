// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvGraphEdge extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraphEdge() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvGraphEdge(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraphEdge(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvGraphEdge position(long position) {
        return (CvGraphEdge)super.position(position);
    }
    @Override public CvGraphEdge getPointer(long i) {
        return new CvGraphEdge(this).position(position + i);
    }

    public native int flags(); public native CvGraphEdge flags(int setter);
    public native float weight(); public native CvGraphEdge weight(float setter);
    public native CvGraphEdge next(int i); public native CvGraphEdge next(int i, CvGraphEdge setter);
    @MemberGetter public native @Cast("CvGraphEdge**") PointerPointer next();
    public native CvGraphVtx vtx(int i); public native CvGraphEdge vtx(int i, CvGraphVtx setter);
    @MemberGetter public native @Cast("CvGraphVtx**") PointerPointer vtx();
}
