package com.example.edacycours.data.repository

import com.example.edacycours.data.dao.WebsiteDao
import com.example.edacycours.database


object WebsiteRepository : BaseRepository<WebsiteDao> {

    override fun dao(): WebsiteDao {
        return database.websiteDao()
    }
}