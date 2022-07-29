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
package org.dubhe.serving.client.fallback;

import org.dubhe.biz.base.vo.DataResponseBody;
import org.dubhe.biz.dataresponse.factory.DataResponseFactory;
import org.dubhe.serving.client.MailClient;

/**
 * @description 邮箱服务远程调用熔断类
 * @date 2021-01-21
 */
public class MailClientFallback implements MailClient {


    @Override
    public DataResponseBody sendHtmlMail(String to, String subject, String content) {
        return DataResponseFactory.failed("call dubhe-admin server findById error");
    }
}
