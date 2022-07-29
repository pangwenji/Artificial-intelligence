/**
 * Copyright 2020 Tianshu AI Platform. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =============================================================
 */

package org.dubhe.serving.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description 推理图片信息
 * @date 2020-10-13
 */
@Data
public class DataInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * base64编码后的图片文件
     */
    private String dataFile;

    /**
     * 图片名称
     */
    private String dataName;
}
