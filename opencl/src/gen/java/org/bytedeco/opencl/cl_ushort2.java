// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;



/* ---- cl_ushortn ---- */
@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_ushort2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_ushort2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_ushort2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_ushort2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_ushort2 position(long position) {
        return (cl_ushort2)super.position(position);
    }
    @Override public cl_ushort2 getPointer(long i) {
        return new cl_ushort2(this).position(position + i);
    }

    public native @Cast("cl_ushort") int s(int i); public native cl_ushort2 s(int i, int setter);
    @MemberGetter public native @Cast("cl_ushort*") IntPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_USHORT2__)
// #endif
}
