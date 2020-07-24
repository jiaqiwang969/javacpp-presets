// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_quality.*;

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
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

public class opencv_quality extends org.bytedeco.opencv.presets.opencv_quality {
    static { Loader.load(); }

// Parsed from <opencv2/quality.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITY_HPP
// #define OPENCV_QUALITY_HPP

// #include "quality/qualitybase.hpp"
// #include "quality/qualitymse.hpp"
// #include "quality/qualitypsnr.hpp"
// #include "quality/qualityssim.hpp"
// #include "quality/qualitygmsd.hpp"
// #include "quality/qualitybrisque.hpp"

// #endif

// Parsed from <opencv2/quality/qualitybase.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITYBASE_HPP
// #define OPENCV_QUALITYBASE_HPP

// #include <opencv2/core.hpp>

/**
\defgroup quality Image Quality Analysis (IQA) API
*/
// Targeting ../opencv_quality/QualityBase.java

  // QualityBase
/** \} */
   // quality
   // cv
// #endif

// Parsed from <opencv2/quality/quality_utils.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITY_QUALITY_UTILS_HPP
// #define OPENCV_QUALITY_QUALITY_UTILS_HPP

// #include "qualitybase.hpp"

// default type of matrix to expand to
@Namespace("cv::quality::quality_utils") @MemberGetter public static native int EXPANDED_MAT_DEFAULT_TYPE();
public static final int EXPANDED_MAT_DEFAULT_TYPE = EXPANDED_MAT_DEFAULT_TYPE();

// convert inputarray to specified mat type.  set type == -1 to preserve existing type

// extract and expand matrix to target type

// return mat of observed min/max pair per column
//  row 0:  min per column
//  row 1:  max per column
// template <typename T>
@Namespace("cv::quality::quality_utils") public static native @ByVal Mat get_column_range( @Const @ByRef Mat data );   // get_column_range

// linear scale of each column from min to max
//  range is column-wise pair of observed min/max.  See get_column_range

   // quality_utils
   // quality
   // cv
// #endif

// Parsed from <opencv2/quality/qualitymse.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITY_QUALITYMSE_HPP
// #define OPENCV_QUALITY_QUALITYMSE_HPP

// #include "qualitybase.hpp"
// Targeting ../opencv_quality/QualityMSE.java

  // QualityMSE
   // quality
   // cv
// #endif


// Parsed from <opencv2/quality/qualitypsnr.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITY_QUALITYPSNR_HPP
// #define OPENCV_QUALITY_QUALITYPSNR_HPP

// #include <limits>   // numeric_limits
// #include "qualitybase.hpp"
// #include "qualitymse.hpp"
// Targeting ../opencv_quality/QualityPSNR.java

    // QualityPSNR
   // quality
   // cv
// #endif

// Parsed from <opencv2/quality/qualityssim.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITY_QUALITYSSIM_HPP
// #define OPENCV_QUALITY_QUALITYSSIM_HPP

// #include "qualitybase.hpp"
// Targeting ../opencv_quality/QualitySSIM.java

  // QualitySSIM
   // quality
   // cv
// #endif

// Parsed from <opencv2/quality/qualitygmsd.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITY_QUALITYGMSD_HPP
// #define OPENCV_QUALITY_QUALITYGMSD_HPP

// #include "qualitybase.hpp"
// Targeting ../opencv_quality/QualityGMSD.java

  // QualityGMSD
   // quality
   // cv
// #endif

// Parsed from <opencv2/quality/qualitybrisque.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_QUALITY_QUALITYBRISQUE_HPP
// #define OPENCV_QUALITY_QUALITYBRISQUE_HPP

// #include "qualitybase.hpp"
// #include "opencv2/ml.hpp"
// Targeting ../opencv_quality/QualityBRISQUE.java

  // QualityBRISQUE
   // quality
   // cv
// #endif


}
