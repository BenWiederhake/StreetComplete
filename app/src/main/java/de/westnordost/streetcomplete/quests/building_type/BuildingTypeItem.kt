package de.westnordost.streetcomplete.quests.building_type

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.view.image_select.Item
import de.westnordost.streetcomplete.quests.building_type.BuildingType.*

fun List<BuildingType>.toItems() = this.map { it.asItem() }

fun BuildingType.asItem(): Item<String> = when(this) {
    HOUSE -> Item(this.osmTag, R.drawable.ic_building_house, R.string.quest_buildingType_house, R.string.quest_buildingType_house_description)
    APARTMENTS -> Item(this.osmTag, R.drawable.ic_building_apartments, R.string.quest_buildingType_apartments, R.string.quest_buildingType_apartments_description)
    DETACHED -> Item(this.osmTag, R.drawable.ic_building_detached, R.string.quest_buildingType_detached, R.string.quest_buildingType_detached_description)
    SEMI_DETACHED -> Item(this.osmTag, R.drawable.ic_building_semi_detached, R.string.quest_buildingType_semi_detached, R.string.quest_buildingType_semi_detached_description)
    TERRACE -> Item(this.osmTag, R.drawable.ic_building_terrace, R.string.quest_buildingType_terrace2, R.string.quest_buildingType_terrace_description)
    HOTEL -> Item(this.osmTag, R.drawable.ic_building_hotel, R.string.quest_buildingType_hotel)
    DORMITORY -> Item(this.osmTag, R.drawable.ic_building_dormitory, R.string.quest_buildingType_dormitory)
    HOUSEBOAT -> Item(this.osmTag, R.drawable.ic_building_houseboat, R.string.quest_buildingType_houseboat)
    BUNGALOW -> Item(this.osmTag, R.drawable.ic_building_bungalow, R.string.quest_buildingType_bungalow, R.string.quest_buildingType_bungalow_description2)
    STATIC_CARAVAN -> Item(this.osmTag, R.drawable.ic_building_static_caravan, R.string.quest_buildingType_static_caravan)
    HUT -> Item(this.osmTag, R.drawable.ic_building_hut, R.string.quest_buildingType_hut, R.string.quest_buildingType_hut_description)

    INDUSTRIAL -> Item(this.osmTag, R.drawable.ic_building_industrial, R.string.quest_buildingType_industrial, R.string.quest_buildingType_industrial_description)
    RETAIL -> Item(this.osmTag, R.drawable.ic_building_retail, R.string.quest_buildingType_retail, R.string.quest_buildingType_retail_description)
    OFFICE -> Item(this.osmTag, R.drawable.ic_building_office, R.string.quest_buildingType_office)
    WAREHOUSE -> Item(this.osmTag, R.drawable.ic_building_warehouse, R.string.quest_buildingType_warehouse)
    KIOSK -> Item(this.osmTag, R.drawable.ic_building_kiosk, R.string.quest_buildingType_kiosk)
    STORAGE_TANK -> Item(this.osmTag, R.drawable.ic_building_storage_tank, R.string.quest_buildingType_storage_tank)

    KINDERGARTEN -> Item(this.osmTag, R.drawable.ic_building_kindergarten, R.string.quest_buildingType_kindergarten)
    SCHOOL -> Item(this.osmTag, R.drawable.ic_building_school, R.string.quest_buildingType_school)
    COLLEGE -> Item(this.osmTag, R.drawable.ic_building_college, R.string.quest_buildingType_college)
    SPORTS_CENTRE -> Item(this.osmTag, R.drawable.ic_sport_volleyball, R.string.quest_buildingType_sports_centre)
    HOSPITAL -> Item(this.osmTag, R.drawable.ic_building_hospital, R.string.quest_buildingType_hospital)
    STADIUM -> Item(this.osmTag, R.drawable.ic_sport_volleyball, R.string.quest_buildingType_stadium)
    TRAIN_STATION -> Item(this.osmTag, R.drawable.ic_building_train_station, R.string.quest_buildingType_train_station)
    TRANSPORTATION -> Item(this.osmTag, R.drawable.ic_building_transportation, R.string.quest_buildingType_transportation)
    UNIVERSITY -> Item(this.osmTag, R.drawable.ic_building_university, R.string.quest_buildingType_university)
    GOVERNMENT -> Item(this.osmTag, R.drawable.ic_building_historic, R.string.quest_buildingType_government)

    CHURCH -> Item(this.osmTag, R.drawable.ic_religion_christian, R.string.quest_buildingType_church)
    CHAPEL -> Item(this.osmTag, R.drawable.ic_religion_christian, R.string.quest_buildingType_chapel)
    CATHEDRAL -> Item(this.osmTag, R.drawable.ic_religion_christian, R.string.quest_buildingType_cathedral)
    MOSQUE -> Item(this.osmTag, R.drawable.ic_religion_muslim, R.string.quest_buildingType_mosque)
    TEMPLE -> Item(this.osmTag, R.drawable.ic_building_temple, R.string.quest_buildingType_temple)
    PAGODA -> Item(this.osmTag, R.drawable.ic_building_temple, R.string.quest_buildingType_pagoda)
    SYNAGOGUE -> Item(this.osmTag, R.drawable.ic_religion_jewish, R.string.quest_buildingType_synagogue)
    SHRINE -> Item(this.osmTag, R.drawable.ic_building_temple, R.string.quest_buildingType_shrine)

    CARPORT -> Item(this.osmTag, R.drawable.ic_building_carport, R.string.quest_buildingType_carport, R.string.quest_buildingType_carport_description)
    GARAGE -> Item(this.osmTag, R.drawable.ic_building_garage, R.string.quest_buildingType_garage)
    GARAGES -> Item(this.osmTag, R.drawable.ic_building_garages, R.string.quest_buildingType_garages, R.string.quest_buildingType_garages_description)
    PARKING -> Item(this.osmTag, R.drawable.ic_building_parking, R.string.quest_buildingType_parking)

    FARM -> Item(this.osmTag, R.drawable.ic_building_farm_house, R.string.quest_buildingType_farmhouse, R.string.quest_buildingType_farmhouse_description)
    FARM_AUXILIARY -> Item(this.osmTag, R.drawable.ic_building_barn, R.string.quest_buildingType_farm_auxiliary, R.string.quest_buildingType_farm_auxiliary_description)
    SILO -> Item(this.osmTag, R.drawable.ic_building_silo, R.string.quest_buildingType_silo)
    GREENHOUSE -> Item(this.osmTag, R.drawable.ic_building_greenhouse, R.string.quest_buildingType_greenhouse)

    SHED -> Item(this.osmTag, R.drawable.ic_building_shed, R.string.quest_buildingType_shed)
    ROOF -> Item(this.osmTag, R.drawable.ic_building_roof, R.string.quest_buildingType_roof)
    TOILETS -> Item(this.osmTag, R.drawable.ic_building_toilets, R.string.quest_buildingType_toilets)
    SERVICE -> Item(this.osmTag, R.drawable.ic_building_service, R.string.quest_buildingType_service, R.string.quest_buildingType_service_description)
    HANGAR -> Item(this.osmTag, R.drawable.ic_building_hangar, R.string.quest_buildingType_hangar, R.string.quest_buildingType_hangar_description)
    BUNKER -> Item(this.osmTag, R.drawable.ic_building_bunker, R.string.quest_buildingType_bunker)
    HISTORIC -> Item(this.osmTag, R.drawable.ic_building_historic, R.string.quest_buildingType_historic, R.string.quest_buildingType_historic_description)
    ABANDONED -> Item(this.osmTag, R.drawable.ic_building_abandoned, R.string.quest_buildingType_abandoned, R.string.quest_buildingType_abandoned_description)
    RUINS -> Item(this.osmTag, R.drawable.ic_building_ruins, R.string.quest_buildingType_ruins, R.string.quest_buildingType_ruins_description)

    RESIDENTIAL -> Item(this.osmTag, R.drawable.ic_building_apartments, R.string.quest_buildingType_residential, R.string.quest_buildingType_residential_description)
    COMMERCIAL -> Item(this.osmTag, R.drawable.ic_building_office, R.string.quest_buildingType_commercial, R.string.quest_buildingType_commercial_generic_description)
    CIVIC -> Item(this.osmTag, R.drawable.ic_building_civic, R.string.quest_buildingType_civic, R.string.quest_buildingType_civic_description)
    RELIGIOUS -> Item(this.osmTag, R.drawable.ic_building_temple, R.string.quest_buildingType_religious)
    FOR_CARS -> Item(this.osmTag, R.drawable.ic_building_car, R.string.quest_buildingType_cars)
    FOR_FARMS -> Item(this.osmTag, R.drawable.ic_building_farm, R.string.quest_buildingType_farm)
    OTHER -> Item(this.osmTag, R.drawable.ic_building_other, R.string.quest_buildingType_other)
}
