package org.chymg.kernelsu.data.repository

import org.chymg.kernelsu.data.model.AppInfo

interface SuperUserRepository {
    suspend fun getAppList(): Result<Pair<List<AppInfo>, List<Int>>>
    suspend fun refreshProfiles(currentApps: List<AppInfo>): Result<List<AppInfo>>
}
