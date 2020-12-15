// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;



/* ---- cl_shortn ---- */
@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_short2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_short2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_short2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_short2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_short2 position(long position) {
        return (cl_short2)super.position(position);
    }
    @Override public cl_short2 getPointer(long i) {
        return new cl_short2(this).position(position + i);
    }

    public native @Cast("cl_short") int s(int i); public native cl_short2 s(int i, int setter);
    @MemberGetter public native @Cast("cl_short*") IntPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_SHORT2__)
// #endif
}
