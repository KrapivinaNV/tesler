/*-
 * #%L
 * IO Tesler - API
 * %%
 * Copyright (C) 2018 - 2019 Tesler Contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package io.tesler.api.task.executors;

import org.springframework.scheduling.SchedulingTaskExecutor;


public class DelegatingSchedulingTaskExecutor<T extends SchedulingTaskExecutor> extends DelegatingAsyncTaskExecutor<T>
		implements SchedulingTaskExecutor {

	public DelegatingSchedulingTaskExecutor(T delegate) {
		super(delegate);
	}

	@Override
	public boolean prefersShortLivedTasks() {
		return getDelegate().prefersShortLivedTasks();
	}

}
