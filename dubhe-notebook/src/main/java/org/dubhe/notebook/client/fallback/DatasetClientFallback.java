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

package org.dubhe.notebook.client.fallback;

import org.dubhe.biz.base.constant.ResponseCode;
import org.dubhe.biz.base.vo.DataResponseBody;
import org.dubhe.biz.base.vo.DatasetVO;
import org.dubhe.notebook.client.DatasetClient;
import org.springframework.stereotype.Component;

/**
 * @description 数据集远程调用失败处理类
 * @date 2021-05-28
 */
@Component
public class DatasetClientFallback implements DatasetClient {
    @Override
    public DataResponseBody<DatasetVO> get(int datasetId) {
        return new DataResponseBody(ResponseCode.SERVICE_ERROR, "DatasetClientFallback 远程调用失败，请稍后重试！");
    }
}
