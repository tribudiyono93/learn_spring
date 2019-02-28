package com.tri.learn;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.tri.learn.model.DWNotifAttempt;

import org.springframework.jdbc.core.RowMapper;

public class DWNotifAttemptResultMapper  implements RowMapper<DWNotifAttempt>{
	
	@Override
	public DWNotifAttempt mapRow(ResultSet rs, int rowNum) throws SQLException {

		DWNotifAttempt result = new DWNotifAttempt();
		
		result.setNotifId(rs.getString("notif_id"));
		result.setAttemptNo(rs.getInt("attempt_no"));
		result.setCabId(rs.getString("cab_id"));
	    result.setClientId(rs.getInt("client_id"));
	    result.setAppType(rs.getString("app_type"));
	    result.setPriority(rs.getInt("priority"));
	    result.setClientNotifRefId(rs.getString("client_notif_ref_id"));
	    result.setNotifStatusCode(rs.getString("notif_status_code"));
	    result.setDestId(rs.getString("dest_id"));
	    result.setMediaType(rs.getString("media_type"));
	    result.setFromAddress(rs.getString("from_address"));
	    /*address,
	    dispatch_sid,
	    checkpoints,
	    result_code,
	    duration_seconds,
	    start_time,
	    end_time,
	    cab_processing_time,
	    cab_creation_time,
	    cab_creation_date,
	    cab_creation_month,
	    cab_creation_year,
	    notif_creation_time,
	    attempt_creation_time,
	    flushed_time,
	    owner,
	    carrier,
	    operator,
	    transfer_start_time,
	    transfer_end_time,
	    transfer_duration*/

		return result;
	}
}
