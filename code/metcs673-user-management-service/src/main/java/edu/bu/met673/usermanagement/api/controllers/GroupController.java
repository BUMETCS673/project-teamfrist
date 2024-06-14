package edu.bu.met673.usermanagement.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.bu.met673.usermanagement.api.model.GroupDto;
import edu.bu.met673.usermanagement.api.model.UserDto;
import edu.bu.met673.usermanagement.api.model.UserGroupDto;
import edu.bu.met673.usermanagement.service.UserGroupService;
import io.micrometer.observation.annotation.Observed;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Observed
@RequestMapping("v1/groups")
@CrossOrigin(origins = "*")
@Tag(name = "Group Management", description = "APIs for managing group memberships")
public class GroupController {
    
    private UserGroupService userGroupService;
    
    public GroupController(@Autowired UserGroupService userGroupService) {
        this.userGroupService = userGroupService;
    }
    
    @Operation(summary = "Add users to a group", description = "Endpoint to add multiple users to a group.")
    @PostMapping("/{groupId}/members")
    public ResponseEntity<UserDto> addUsersToGroup(
            @PathVariable(name="groupId") String groupId, 
            @RequestBody List<String> userIds) {
        // Implementation
        return ResponseEntity.ok().body(null);
    }
    
    @Operation(summary = "Add a user to a group", description = "Endpoint to add a single user to a group.")
    @PostMapping("/{groupId}/members/{userId}")
    public ResponseEntity<UserGroupDto> addUserToGroup(
            @PathVariable(name="groupId") String groupId, 
            @PathVariable(name="userId") String userId) {
        // Implementation
        return ResponseEntity.ok().body(null);
    }

    @Operation(summary = "Get group by ID", description = "Endpoint to retrieve a group by its ID.")
    @GetMapping("/{id}")
    public ResponseEntity<GroupDto> getGroupById(
            @Parameter(description = "ID of the group to be obtained") @PathVariable(name="id") String groupId) {
        // Implementation
        return ResponseEntity.ok().body(null);
    }
    
    @Operation(summary = "Get all groups", description = "Endpoint to retrieve all groups with optional filtering.")
    @GetMapping("/")
    public ResponseEntity<List<GroupDto>> getAllGroups(
            @Parameter(description = "Filter criteria") @RequestParam(name="filter") String filter,
            @RequestParam(defaultValue = "0", name = "page") int page,
            @RequestParam(defaultValue = "100", name = "size") int size,
            @RequestParam(defaultValue = "id,desc", name = "sort") String[] sort) {
        // Implementation
        return ResponseEntity.ok().body(null);
    }

    @Operation(summary = "Create a user group", description = "Endpoint to create a new user group.")
    @PostMapping("/")
    public ResponseEntity<GroupDto> createUserGroup(
            @RequestBody GroupDto groupDto) {
        // Implementation
        return ResponseEntity.ok().body(null);
    }
}