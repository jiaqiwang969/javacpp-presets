// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Batch normalization backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class batch_normalization_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public batch_normalization_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public batch_normalization_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public batch_normalization_backward position(long position) {
        return (batch_normalization_backward)super.position(position);
    }
    @Override public batch_normalization_backward getPointer(long i) {
        return new batch_normalization_backward(this).position(position + i);
    }

    /** Descriptor for a batch normalization backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_batch_normalization_desc_t data(); public native desc data(dnnl_batch_normalization_desc_t setter);

        /** Constructs a batch normalization descriptor for backward
         *  propagation.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::backward_data and #dnnl::prop_kind::backward
         *      (diffs for all parameters are computed in this case).
         *  @param diff_data_desc Diff source and diff destination memory
         *      descriptor.
         *  @param data_desc Source memory descriptor.
         *  @param epsilon Batch normalization epsilon parameter.
         *  @param flags Batch normalization flags (\ref
         *      dnnl::normalization_flags). */
        public desc(prop_kind aprop_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float epsilon,
                        normalization_flags flags) { super((Pointer)null); allocate(aprop_kind, diff_data_desc, data_desc, epsilon, flags); }
        private native void allocate(prop_kind aprop_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float epsilon,
                        normalization_flags flags);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float epsilon,
                        @Cast("dnnl::normalization_flags") int flags) { super((Pointer)null); allocate(aprop_kind, diff_data_desc, data_desc, epsilon, flags); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Const @ByRef memory.desc diff_data_desc,
                        @Const @ByRef memory.desc data_desc, float epsilon,
                        @Cast("dnnl::normalization_flags") int flags);
    }

    /** Primitive descriptor for a batch normalization backward propagation
     *  primitive. */
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

        /** Constructs a primitive descriptor for a batch normalization backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a batch normalization backward
         *      propagation primitive.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a batch normalization
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a batch normalization backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a batch normalization backward
         *      propagation primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a batch normalization
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef batch_normalization_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a batch normalization
         *  backward propagation primitive from a C API primitive descriptor
         *  that must have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a batch normalization
         *      backward propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal memory.desc weights_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_weights_desc()const */
        public native @ByVal memory.desc diff_weights_desc();

        /** \copydoc dnnl::batch_normalization_forward::primitive_desc::mean_desc()const */
        public native @ByVal memory.desc mean_desc();

        /** \copydoc dnnl::batch_normalization_forward::primitive_desc::variance_desc()const */
        public native @ByVal memory.desc variance_desc();

        /** \copydoc dnnl::primitive_desc_base::workspace_desc()const */
        public native @ByVal memory.desc workspace_desc();
    }

    /** Default constructor. Produces an empty object. */
    public batch_normalization_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a batch normalization backward propagation primitive.
     *  @param pd Primitive descriptor for a batch normalization backward
     *      propagation primitive. */
    public batch_normalization_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
