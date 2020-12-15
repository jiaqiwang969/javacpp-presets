// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_pooling_v2
 <p>
 *  \addtogroup dnnl_api_reduction Reduction
 * 
 *  A primitive to compute reduction operation on data tensor
 *  using min, max, mul, sum, mean and norm_lp operations.
 * 
 *  @see \ref dev_guide_reduction in developer guide
 * 
 *  \{
 <p>
 *  Reduction. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class reduction extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public reduction(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public reduction(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public reduction position(long position) {
        return (reduction)super.position(position);
    }
    @Override public reduction getPointer(long i) {
        return new reduction(this).position(position + i);
    }

    /** Descriptor for reduction. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public desc position(long position) {
            return (desc)super.position(position);
        }
        @Override public desc getPointer(long i) {
            return new desc(this).position(position + i);
        }
    
        public native @ByRef dnnl_reduction_desc_t data(); public native desc data(dnnl_reduction_desc_t setter);

        /** Default constructor. Produces an empty object. */
        
        ///
        ///
        public desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a descriptor for a reduction primitive using algorithm
         *  specific parameters, source and destination memory descriptors.
         * 
         *  \note
         *      Destination memory descriptor may be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param aalgorithm reduction algorithm kind. Possible values:
         *      #dnnl_reduction_max, #dnnl_reduction_min, #dnnl_reduction_sum,
         *      #dnnl_reduction_mul, #dnnl_reduction_mean,
         *      #dnnl_reduction_norm_lp_max, #dnnl_reduction_norm_lp_sum,
         *      #dnnl_reduction_norm_lp_power_p_max,
         *      #dnnl_reduction_norm_lp_power_p_sum.
         *  @param p algorithm specific parameter.
         *  @param eps algorithm specific parameter.
         *  @param src_desc Source memory descriptor.
         *  @param dst_desc Destination memory descriptor. */
        public desc(algorithm aalgorithm, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc, float p, float eps) { super((Pointer)null); allocate(aalgorithm, src_desc, dst_desc, p, eps); }
        private native void allocate(algorithm aalgorithm, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc, float p, float eps);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc, float p, float eps) { super((Pointer)null); allocate(aalgorithm, src_desc, dst_desc, p, eps); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc src_desc,
                        @Const @ByRef memory.desc dst_desc, float p, float eps);
    }

    /** Primitive descriptor for a reduction primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc(this).position(position + i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a reduction primitive.
         * 
         *  @param adesc Descriptor for a reduction primitive.
         *  @param aengine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a reduction primitive.
         * 
         *  @param adesc Descriptor for a reduction primitive.
         *  @param aengine Engine to use.
         *  @param attr Primitive attributes to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, attr, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a reduction primitive from a C
         *  API primitive descriptor that must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a reduction primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public reduction() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a reduction primitive.
     *  @param pd Primitive descriptor for a reduction primitive. */
    public reduction(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
